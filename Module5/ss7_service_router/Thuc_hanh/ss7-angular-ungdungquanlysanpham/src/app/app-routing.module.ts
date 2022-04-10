import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {ProductlistComponent} from './product/productlist/productlist.component';
import {ProductCreateComponent} from './product/product-create/product-create.component';
import {ProductEditorComponent} from './product/product-editor/product-editor.component';


const routes: Routes = [
  {
    path: 'product/list',
    component: ProductlistComponent
  },
  {
    path:'product/create',
    component: ProductCreateComponent
  },
  {
    path:'product/edit/:id',
    component: ProductEditorComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
