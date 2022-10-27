# Oblig-3---git---Lars-Kristian-Olsen

For å sette opp automatisk testing i github, så begynte jeg først med å opprette ett repository.

Deretter koblet jeg intelliJ opp til github og clonet det tomme repoet.

Så overførte jeg alle filene fra oblig 2 over i mappen til det klonede repositoriet og commitet dette til main branch på github

Jeg fikk satt opp maven i github og fant ut at jeg måtte endre versjonen av JDK fra 11 som stod der fra før til 17.

Endret navnet på testene til å begynne med "Test" og endret scopen av av jupiter dependency avsnittet i pom filen til test etter et tips fra en medstudent.

Deretter oppdaterte jeg IntelliJ, ettersom jeg hadde problemer med å kjøre testene lokalt på maskinen.

Til slutt la jeg til run tests i maven filen for at testene skulle kjøres hver gang og dorny/test-reporter@v1 til å få tilbakemelding når testene er kjørt
