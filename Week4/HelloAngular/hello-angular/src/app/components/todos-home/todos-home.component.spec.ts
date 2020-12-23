import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TodosHomeComponent } from './todos-home.component';

describe('TodosHomeComponent', () => {
  let component: TodosHomeComponent;
  let fixture: ComponentFixture<TodosHomeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TodosHomeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TodosHomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
