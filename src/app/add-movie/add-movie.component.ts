import { Component, OnInit } from '@angular/core';
import { MovieServiceService, Movie } from '../movie-service.service';

@Component({
  selector: 'app-add-movie',
  templateUrl: './add-movie.component.html',
  styleUrls: ['./add-movie.component.css']
})
export class AddMovieComponent implements OnInit {

  movie_obj:Movie = new Movie(0,"","","","","","");

  add_message:string;

  check0:boolean = true;
  check1:boolean = false;

  constructor(private service:MovieServiceService) { }

  ngOnInit(): void {
  }

  add_movie(){
    this.service.add_movie(this.movie_obj).subscribe((data)=>{
      this.add_message=data;
      this.check0 = false;
      this.check1 = true;
  });
}
}
