import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminCheckBalanceComponent } from './admin-check-balance.component';

describe('AdminCheckBalanceComponent', () => {
  let component: AdminCheckBalanceComponent;
  let fixture: ComponentFixture<AdminCheckBalanceComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AdminCheckBalanceComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminCheckBalanceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
