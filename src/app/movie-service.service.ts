import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

export class Movie{
  movie_Id:number;
  movie_Name:string;
  movie_Genre:string;
  movie_Director:string;
  movie_Length:string;
  languages:string;
  movie_Release_Date:string;

  constructor(movie_Id:number, movie_Name:string, movie_Genre:string, movie_Director:string, movie_Length:string, languages:string, movie_Release_Date:string){
    this.movie_Id = movie_Id;
    this.movie_Name = movie_Name;
    this.movie_Genre = movie_Genre;
    this.movie_Director = movie_Director;
    this.movie_Length = movie_Length;
    this.languages = languages;
    this.movie_Release_Date = movie_Release_Date;
  }
}

export class Show{
  show_Id:number;
  show_Start_Time:string;
  show_End_Time:string;
  show_Name:string;
  movie_Id:number;
  screen_Id:number;
  r_movie_id:number;
  constructor(show_Id:number, show_Start_Time:string, show_End_Time:string, show_Name:string, movie_Id:number, screen_Id:number, r_movie_id:number){
    this.show_Id = show_Id;
    this.show_Start_Time = show_Start_Time;
    this.show_End_Time = show_End_Time;
    this.show_Name = show_Name;
    this.movie_Id = movie_Id;
    this.screen_Id = screen_Id;
    this.r_movie_id = r_movie_id;
  }
}

export class Theatre{
  theatre_Id:number;
  theatre_Name:string;
  theatre_City:string;
  movie_Id:number;
  manager_Name:string;
  manager_Contact:string;
  r_movie_id:number;
  constructor(theatre_Id:number, theatre_Name:string, theatre_City:string, movie_Id:number, manager_Name:string, manager_Contact:string, r_movie_id:number){
    this.theatre_Id = theatre_Id;
    this.theatre_Name = theatre_Name;
    this.theatre_City = theatre_City;
    this.movie_Id = movie_Id;
    this.manager_Name = manager_Name;
    this.manager_Contact = manager_Contact;
    this.r_movie_id = r_movie_id;
  }
}

@Injectable({
  providedIn: 'root'
})
export class MovieServiceService {

  constructor(private http:HttpClient) { }

  public add_movie(movie){
    return this.http.post("http://localhost:1000/add/movie",movie,{responseType:'text'});
  }

  public add_show_details(show){
    return this.http.post("http://localhost:2000/add/show",show,{responseType:'text'});
  }

  public add_theatre_details(theatre){
    return this.http.post("http://localhost:3000/add/theatre",theatre,{responseType:'text'});
  }

  public get_all_show(){
    return this.http.get("http://localhost:5000/list_of_shows",{responseType:'json'});
  }

  public delete_show(id:number){
    return this.http.delete("http://localhost:5000/deleteShow/"+id,{responseType:'json'});
  }

  public get_all_theatres(){
    return this.http.get("http://localhost:6100/list_of_theatres",{responseType:'json'});
  }

  public delete_theatre(id:number){
    return this.http.delete("http://localhost:6100/deleteTheatre/"+id,{responseType:'json'});
  }

  public get_all_movies(){
    return this.http.get("http://localhost:4000/list_of_movies",{responseType:'json'});
  }

  public delete_movie(id:number){
    return this.http.delete("http://localhost:4000/deleteMovie/"+id,{responseType:'json'});
  }
}
