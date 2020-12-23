import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TodosBannerComponent } from './todos-banner.component';

describe('TodosBannerComponent', () => {
  let component: TodosBannerComponent;
  let fixture: ComponentFixture<TodosBannerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TodosBannerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TodosBannerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
