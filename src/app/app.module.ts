import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MovieServiceService } from './movie-service.service';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AddMovieComponent } from './add-movie/add-movie.component';
import { AddShowComponent } from './add-show/add-show.component';
import { AddTheatreComponent } from './add-theatre/add-theatre.component';
import { DeleteShowComponent } from './delete-show/delete-show.component';
import { DeleteTheatreComponent } from './delete-theatre/delete-theatre.component';
import { DeleteMovieComponent } from './delete-movie/delete-movie.component';

@NgModule({
  declarations: [
    AppComponent,
    AddMovieComponent,
    AddShowComponent,
    AddTheatreComponent,
    DeleteShowComponent,
    DeleteTheatreComponent,
    DeleteMovieComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [MovieServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
