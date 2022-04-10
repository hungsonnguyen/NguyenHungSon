import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {Product} from '../../model/product';
import {ActivatedRoute, ParamMap} from '@angular/router';
import {ProductService} from '../../service/product.service';

@Component({
  selector: 'app-product-editor',
  templateUrl: './product-editor.component.html',
  styleUrls: ['./product-editor.component.css']
})
export class ProductEditorComponent implements OnInit {
  productForm: FormGroup;
  productEdit: Product;
  id: number;

  constructor(private activatedRoute: ActivatedRoute,
              private productService: ProductService) {
  }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = parseInt(paramMap.get('id'));
      console.log(this.id);
      this.productEdit = this.productService.findById(this.id);

    })
    this.productForm = new FormGroup({
      id: new FormControl(this.productEdit.id),
      name: new FormControl(this.productEdit.name),
      price: new FormControl(this.productEdit.price),
      description: new FormControl(this.productEdit.description),
    });
  }

  ongSubmit() {
    console.log(this.productForm.value);
    this.productService.updateByid(this.id, this.productForm.value);
  }
}
