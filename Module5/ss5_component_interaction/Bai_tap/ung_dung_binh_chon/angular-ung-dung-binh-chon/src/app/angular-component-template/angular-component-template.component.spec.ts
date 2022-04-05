import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AngularComponentTemplateComponent } from './angular-component-template.component';

describe('AngularComponentTemplateComponent', () => {
  let component: AngularComponentTemplateComponent;
  let fixture: ComponentFixture<AngularComponentTemplateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AngularComponentTemplateComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AngularComponentTemplateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
