import { Component, OnInit } from '@angular/core';
import { MovieServiceService, Theatre } from '../movie-service.service';

@Component({
  selector: 'app-add-theatre',
  templateUrl: './add-theatre.component.html',
  styleUrls: ['./add-theatre.component.css']
})
export class AddTheatreComponent implements OnInit {

  check0:boolean = true;
  check1:boolean = false;

  theatre_message:string;

  theatre_obj:Theatre = new Theatre(0,"","",0,"","",0);

  check2: boolean = false;

  constructor(private service:MovieServiceService) { }

  ngOnInit(): void {
  }

  add_theatre(){
    if(this.theatre_obj.movie_Id == this.theatre_obj.r_movie_id)
    {
    this.service.add_theatre_details(this.theatre_obj).subscribe((data)=>{this.theatre_message=data;
      this.check0 = false;
      this.check1 = true;
  });
}
else{
  this.check2 = true;
  this.check0 = false;
  this.check1 = false;
}
}
}
