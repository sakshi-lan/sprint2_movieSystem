import { Component, OnInit } from '@angular/core';
import { MovieServiceService } from '../movie-service.service';

@Component({
  selector: 'app-delete-show',
  templateUrl: './delete-show.component.html',
  styleUrls: ['./delete-show.component.css']
})
export class DeleteShowComponent implements OnInit {

  shows:any;

  check1:boolean = false;
  check0:boolean = false;
  check2:boolean = false;

  constructor(private servie:MovieServiceService) { }

  ngOnInit(): void {
    this.servie.get_all_show().subscribe((data)=>{
      this.shows = data;
      if(this.shows != null){
        this.check1 = true;
        this.check2 = false;
      }
      else{
        this.check2 = true;
        this.check1 = false;
      }
  });
}

  deleteShow(id:number){
    this.servie.delete_show(id).subscribe((data)=>this.shows = data);
    this.check0 = true;
  }
}