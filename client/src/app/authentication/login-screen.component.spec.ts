/* tslint:disable:no-unused-variable */

import { TestBed, async } from '@angular/core/testing';
import { LoginScreenComponent } from './login-screen.component';

describe('CoreComponent', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [
        LoginScreenComponent
      ],
    });
    TestBed.compileComponents();
  });

  it('should create the app', async(() => {
    const fixture = TestBed.createComponent(LoginScreenComponent);
    const app = fixture.debugElement.componentInstance;
    expect(app).toBeTruthy();
  }));

  /*it(`should have as title 'app works!'`, async(() => {
   const fixture = TestBed.createComponent(CoreComponent);
   const app = fixture.debugElement.componentInstance;
   expect(app.title).toEqual('app works!');
   }));

   it('should render title in a h1 tag', async(() => {
   const fixture = TestBed.createComponent(CoreComponent);
   fixture.detectChanges();
   const compiled = fixture.debugElement.nativeElement;
   expect(compiled.querySelector('h1').textContent).toContain('app works!');
   }));*/
});
