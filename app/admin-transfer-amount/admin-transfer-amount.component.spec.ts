import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminTransferAmountComponent } from './admin-transfer-amount.component';

describe('AdminTransferAmountComponent', () => {
  let component: AdminTransferAmountComponent;
  let fixture: ComponentFixture<AdminTransferAmountComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AdminTransferAmountComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminTransferAmountComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
