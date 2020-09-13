import { Component, OnInit } from '@angular/core';
import { GetFeedsService } from '../get-feeds.service';

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.css']
})
export class HomepageComponent implements OnInit {

  constructor(private link:GetFeedsService) { }

  
  newsArr=[];

  ngOnInit() {
    this.link.fetchFeed().subscribe(resp=>this.newsArr=resp.json());
  }




}
