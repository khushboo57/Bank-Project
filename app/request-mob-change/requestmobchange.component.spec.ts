import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RequestmobchangeComponent } from './requestmobchange.component';

describe('RequestmobchangeComponent', () => {
  let component: RequestmobchangeComponent;
  let fixture: ComponentFixture<RequestmobchangeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RequestmobchangeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RequestmobchangeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
