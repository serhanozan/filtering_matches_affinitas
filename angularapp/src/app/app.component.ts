import { Component } from '@angular/core';
import { DataService } from './services/data.service';
import { FilterModel } from './filterModel';

@Component({
    selector: 'app-root',
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.css']
})
export class AppComponent {
    title = 'app';
    filter:FilterModel;
    profiles: any[];

    constructor(public dataService: DataService) {
        this.dataService.getProfiles().subscribe(profiles => {
            this.profiles = profiles;
        });
        this.filter = new FilterModel();
        this.filter.hasPhoto = false;
        this.filter.inContact = false;
        this.filter.isFavourite = false;
        this.filter.minCompatibilityScore = 1;
        this.filter.maxCompatibilityScore = 99;
        this.filter.minAge = 18;
        this.filter.maxAge = 95;
        this.filter.minHeight = 135;
        this.filter.maxHeight = 210;
        this.filter.distanceLevel = "MODERATE";
    }

    filterProfiles(){
        this.filter.minCompatibilityScore /= 100;
        this.filter.maxCompatibilityScore /= 100;
        console.log(this.filter);
        this.dataService.getProfilesFiltered(this.filter).subscribe(profiles => {
            this.profiles = profiles;
        });
        this.filter.minCompatibilityScore *= 100;
        this.filter.maxCompatibilityScore *= 100;
    }
}
