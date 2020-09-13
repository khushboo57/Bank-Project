import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminnextComponent } from './adminnext.component';

describe('AdminnextComponent', () => {
  let component: AdminnextComponent;
  let fixture: ComponentFixture<AdminnextComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AdminnextComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminnextComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
