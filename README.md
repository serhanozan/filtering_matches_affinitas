# Affinitas Coding Challenge

## Filtering Matches

Thank you for the opportunity. It's been a great experience. I had a little time recently, so please excuse me for my mistakes.
I feel more comfortable with backend code. However, I enjoy both backend and frontend. I believe that I am not experienced enough for the frontend, just for now. 
Below I tried to explain what I did, and sometimes, why I did it. 

### Filtering Details

| Filter | Details | What I did |
|--------|---------|------------|
| Has photo | Boolean yes / no filter | I used a checkbox |
| In contact | Boolean yes / no filter | I used a checkbox |
| Favourite | Boolean yes / no filter | I used a checkbox |
| Compatibility Score | range: from 1% to 99% | I used two inputs for min and max |
| age | range: from 18 years old until > 95 years old | I used two inputs for min and max |
| height | range: from 135cm to > 210cm | I used two inputs for min and max |
| distance in km | single selection: lower bound < 30 km, upper bound > 300 km |  I used select input with three choices. One for below 30 km, one for between 30 km and 300 km, and one for above 300 km |


### Server side

The server side is created in Java as a SpringBootApplication. You can just import the project as an existing maven project, then after the project is updated and built, you can run ProfileMatcherApplication.java as a Java application to start the internal Tomcat server.

matches.json is located in src/main/resources and inside SpringBootProfileMatcherApplicationApplication.java, using @postConstruct annotation, it is loaded into the in memory H2 database. No setup is necessary for the database.

I was stuck trying to use Hibernate Spatial and then the latest Hibernate Search with spatial queries. However, I could not do that correctly. Also, using an in-memory database was also not comfortable. Then, I switched to filter the profiles after I get them from the database with other filters.

### Client side

It is web.

##### Web Requirements
The web page is created with Angular 4. Using Angular Cli client and ng build command, the contents inside the dist folder are moved to the src/main/resources/static folder of the SpringBoot project. Thus, serving them together was made easy. 
If you run the applicaton (ProfileMatcherApplication.java) as a Java application, it should load the web components. 
You can just type localhost:8080 in your browser, and the main page of the angular app should be there.
There is an initial list of all matching profiles below your filters. 
You can use the filters and hit the filter button to see the resulting (filtered) list of matches.

##### App Requirements
I did not created an app.
