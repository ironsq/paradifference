import {Component, OnInit} from '@angular/core';
import {User} from "./user";
import {CoreService} from './core.service'

@Component({
  selector: 'core-component',
  templateUrl: 'core.html'
})

export class CoreComponent implements OnInit {

  name = 'it works';
  users: User[];

  constructor(
    private coreService: CoreService
  ) {}
cd
  ngOnInit(): void {
    this.getUsers();
  }

  getUsers(): void {
    //this.coreService.getUsers().then(users => this.users = users);
    //this.users = this.coreService.getUsers();
    this.coreService.getUsers().subscribe(result => this.users = result);
  }
}
