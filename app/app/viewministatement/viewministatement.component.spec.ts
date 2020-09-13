import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewministatementComponent } from './viewministatement.component';

describe('ViewministatementComponent', () => {
  let component: ViewministatementComponent;
  let fixture: ComponentFixture<ViewministatementComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewministatementComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewministatementComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
