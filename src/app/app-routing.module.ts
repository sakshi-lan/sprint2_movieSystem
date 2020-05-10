import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddMovieComponent } from './add-movie/add-movie.component';
import { AddShowComponent } from './add-show/add-show.component';
import { AddTheatreComponent } from './add-theatre/add-theatre.component';
import { DeleteShowComponent } from './delete-show/delete-show.component';
import { DeleteTheatreComponent } from './delete-theatre/delete-theatre.component';
import { DeleteMovieComponent } from './delete-movie/delete-movie.component';


const routes: Routes = [
  {path:'Add-Movie', component:AddMovieComponent},
  {path:'Add-Show', component:AddShowComponent},
  {path:'Add-Theatre',component:AddTheatreComponent},
  {path:'Delete-Show', component:DeleteShowComponent},
  {path:'Delete-Theatre',component:DeleteTheatreComponent},
  {path:'Delete-Movie', component:DeleteMovieComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
