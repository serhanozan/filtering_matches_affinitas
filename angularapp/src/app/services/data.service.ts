import { Injectable } from '@angular/core';
import { Http } from '@angular/http';
import 'rxjs/add/operator/map';
import { FilterModel } from '../filterModel';

@Injectable()
export class DataService{
    
    constructor(public http:Http){

    }

    getProfiles(){
        return this.http.get('http://localhost:8080/profile/all')
            .map(res => res.json());
    }

    getProfilesFiltered(filter : FilterModel){
        return this.http.post('http://localhost:8080/profile/filtered', filter)
            .map(res => res.json());
    }
}