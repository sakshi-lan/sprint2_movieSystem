import { Component, OnInit } from '@angular/core';
import { MovieServiceService } from '../movie-service.service';

@Component({
  selector: 'app-delete-theatre',
  templateUrl: './delete-theatre.component.html',
  styleUrls: ['./delete-theatre.component.css']
})
export class DeleteTheatreComponent implements OnInit {

  theatres:any;

  check1:boolean = false;
  check0:boolean = false;
  check2:boolean = false;

  constructor(private service:MovieServiceService) { }

  ngOnInit(): void {
    this.service.get_all_theatres().subscribe((data)=>{
      this.theatres = data;
      if(this.theatres != null){
        this.check1 = true;
        this.check2 = false;
      }
      else{
        this.check2 = true;
        this.check1 = false;
      }
  });
}

  deleteTheatre(id:number){
    this.service.delete_theatre(id).subscribe((data)=>this.theatres = data);
    this.check0 = true;
  }

}
