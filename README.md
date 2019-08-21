# songr

## How to run
- NOTE! Users must set the application.properties values to your postgresql username. 
spring.datasource.username=  
spring.datasource.password=  
These are located [here.](https://github.com/kdcouture/songr/blob/master/src/main/resources/application.properties)  
This will delete and create a clean table each run unless the last line ending in create is commented out.


- 1: Navigate to the root folder of the project.
- 2: Run > gradle bootRun < in the command line.

---
## Routes
---
### /albums
- This route will display all albums in the database and also allow users to add an album into the database.
---
### /hello and /
- This route acts as a welcome screen
---
### /reverse?sentence=Place ToReverse Here
- This route will display the sentence reversed.
---
### /capitalize/Place Sentence Here
- This route will display the sentence capitalize.
