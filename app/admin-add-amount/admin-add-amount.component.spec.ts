import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminAddAmountComponent } from './admin-add-amount.component';

describe('AdminAddAmountComponent', () => {
  let component: AdminAddAmountComponent;
  let fixture: ComponentFixture<AdminAddAmountComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AdminAddAmountComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminAddAmountComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
