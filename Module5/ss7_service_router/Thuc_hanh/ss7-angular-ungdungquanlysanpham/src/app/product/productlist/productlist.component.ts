import {Component, OnInit} from '@angular/core';
import {ProductService} from '../../service/product.service';
import {Product} from '../../model/product';

@Component({
  selector: 'app-productlist',
  templateUrl: './productlist.component.html',
  styleUrls: ['./productlist.component.css']
})
export class ProductlistComponent implements OnInit {
  productlist: Product[];

  constructor(private productService: ProductService) {
  }

  ngOnInit(): void {
    this.productlist = this.productService.getAll();
  }

  delete(id: number) {
    console.log(id);
    this.productService.delete(id)
  }
}
