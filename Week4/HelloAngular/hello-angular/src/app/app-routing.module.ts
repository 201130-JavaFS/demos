import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AnotherComponentComponent } from './components/another-component/another-component.component';

const routes: Routes = [{
  path: "another",
  component: AnotherComponentComponent
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
