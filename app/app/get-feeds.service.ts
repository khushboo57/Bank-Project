import { Injectable } from '@angular/core';
import { Http } from '@angular/http';

@Injectable({
  providedIn: 'root'
})
export class GetFeedsService {

  constructor(private http:Http) { }

  fetchFeed(){
    let url="https://newsapi.org/v2/top-headlines?sources=australian-financial-review&apiKey=e589f7f9174247ca880cdd7f2a61ea4c";
    return this.http.get(url);
  }

}
