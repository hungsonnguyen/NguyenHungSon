import {Injectable} from '@angular/core';
import {Product} from '../model/product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  productlist: Product[] = [
    {
      id: 1,
      name: 'IPhone 12',
      price: 2400000,
      description: 'New'
    }, {
      id: 2,
      name: 'IPhone 11',
      price: 1560000,
      description: 'Like new'
    }, {
      id: 3,
      name: 'IPhone X',
      price: 968000,
      description: '97%'
    }, {
      id: 4,
      name: 'IPhone 8',
      price: 7540000,
      description: '98%'
    }, {
      id: 5,
      name: 'IPhone 11 Pro',
      price: 1895000,
      description: 'Like new'
    }

  ];

  getAll() {
    return this.productlist;
  }

  saveProduct(newProduct: Product) {
    this.productlist.push(newProduct);
  }

  constructor() {
  }

  findById(id : number){
    for (const product of this.productlist) {
      if (id === product.id){
        return product
      }
    }
  }
  updateByid(id: number, product: Product) {

    for (let i = 0; i < this.productlist.length; i++) {
      if (id === this.productlist[i].id) {
        this.productlist[i] = product;
      }
    }
  }
  delete(id:number){
    for (let i = 0;i<this.productlist.length;i++){
      if (id==this.productlist[i].id){
        this.productlist.splice(i,1)
      }
    }
  }
}
