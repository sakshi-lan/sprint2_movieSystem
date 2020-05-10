import { Component, OnInit } from '@angular/core';
import { MovieServiceService } from '../movie-service.service';

@Component({
  selector: 'app-delete-movie',
  templateUrl: './delete-movie.component.html',
  styleUrls: ['./delete-movie.component.css']
})
export class DeleteMovieComponent implements OnInit {

  movies:any;

  check1:boolean = false;
  check0:boolean = false;
  check2:boolean = false;
  check3: boolean = false;

  constructor(private service:MovieServiceService) { }

  ngOnInit(): void {
    this.service.get_all_movies().subscribe((data)=>{
      this.movies = data;
      if(this.movies != null){
        this.check1 = true;
        this.check2 = false;
      }
      else{
        this.check2 = true;
        this.check1 = false;
      }
  });
  }

  deleteMovie(id:number){
    this.service.delete_movie(id).subscribe((data)=>{
    this.movies = data;
    if(this.movies != null){
    this.check0 = true;
    this.check3 = false;
  }
  else{
    this.check3 = true;
    this.check0 = false;
  }
});
  }
}