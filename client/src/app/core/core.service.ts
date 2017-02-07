import { Injectable }    from '@angular/core';
import {User} from './user';
import {Http, Response} from "@angular/http";
import {Observable} from 'rxjs/Observable';
import 'rxjs/add/operator/map';

@Injectable()
export class CoreService {
  private getUsersUrl = 'http://localhost:8080/api/users/';  // URL to web API
  constructor (private http: Http) {}

  getUsers(): Observable<User[]>{
    return this.http.get(this.getUsersUrl).map((response: Response) => <User[]>response.json());
  }

}
