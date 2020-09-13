import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminMobileChangeComponent } from './admin-mobile-change.component';

describe('AdminMobileChangeComponent', () => {
  let component: AdminMobileChangeComponent;
  let fixture: ComponentFixture<AdminMobileChangeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AdminMobileChangeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminMobileChangeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
