import { Observable } from 'rxjs';
import { Component, OnInit } from '@angular/core';
import { Products } from 'src/app/models/products';
import { ProductsService } from 'src/app/Service/products.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

 products!: Observable<Products[]>;

  constructor(private productsService:ProductsService,
    private router:Router ) { }
  ngOnInit(): void {
    this.reloadData();
   
  }

  reloadData(){
    this.products=this.productsService.getProductsList();
  }

}
