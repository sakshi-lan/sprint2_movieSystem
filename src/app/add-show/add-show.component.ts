import { Component, OnInit } from '@angular/core';
import { MovieServiceService, Show } from '../movie-service.service';

@Component({
  selector: 'app-add-show',
  templateUrl: './add-show.component.html',
  styleUrls: ['./add-show.component.css']
})
export class AddShowComponent implements OnInit {

  constructor(private service:MovieServiceService) { }

  show_obj:Show = new Show(0,"","","",0,0,0);

  check0:boolean = true;
  check1:boolean = false;
  check2:boolean = false;

  show_message:string;

  ngOnInit(): void {
  }

  add_show(){
    if(this.show_obj.movie_Id == this.show_obj.r_movie_id)
    {
      console.log(this.show_obj);
    this.service.add_show_details(this.show_obj).subscribe((data)=>{
      this.show_message = data;
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
