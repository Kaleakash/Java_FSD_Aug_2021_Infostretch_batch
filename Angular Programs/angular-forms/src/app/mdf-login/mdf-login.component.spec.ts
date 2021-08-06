import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MdfLoginComponent } from './mdf-login.component';

describe('MdfLoginComponent', () => {
  let component: MdfLoginComponent;
  let fixture: ComponentFixture<MdfLoginComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MdfLoginComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MdfLoginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
