import {Component, OnInit} from '@angular/core';
import {Product} from '../../model/product';
import {ProductService} from '../../service/product.service';
import {FormControl, FormGroup} from '@angular/forms';

@Component({
  selector: 'app-product-create',
  templateUrl: './product-create.component.html',
  styleUrls: ['./product-create.component.css']
})
export class ProductCreateComponent implements OnInit {
  product: Product ={
    id: 0,
    name: '',
    price: 0,
    description: ''
  }
  createProductForm: FormGroup;

  constructor(private productService: ProductService) {
  }

  ngOnInit(): void {
    this.createProductForm = new FormGroup({
      id: new FormControl(''),
      name: new FormControl(''),
      price: new FormControl(''),
      description: new FormControl(''),
    });

  }

  onSubmit() {
    if (this.createProductForm.valid){
      console.log(this.createProductForm.value);
      const product = this.createProductForm.value;
      this.productService.saveProduct(product);
      this.createProductForm.reset();    }

  }
}
