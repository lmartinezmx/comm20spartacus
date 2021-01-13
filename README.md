# comm20spartacus
A hybirs commerce installation (2005) with spartacus storefront integration

# Setting up:

## Versions:

Commerce 2005 (Unzip modules and platform folders into \core-customize\hybris\bin)
node 12.20.1
angular/cli 9.1.13
yarn 1.22.5

## Run the next command to Install the following addons:

```bash
ant addoninstall -Daddonnames="spartacussampledataaddon,commerceorgsamplesaddon,promotionenginesamplesaddon,smarteditaddon,textfieldconfiguratortemplateaddon,assistedservicestorefront,assistedservicepromotionaddon,customerticketingaddon,orderselfserviceaddon,adaptivesearchsamplesaddon,multicountrysampledataaddon,pcmbackofficesamplesaddon,eventtrackingwsaddon,personalizationsearchsamplesaddon,personalizationaddon" -DaddonStorefront.yacceleratorstorefront="yacceleratorstorefront"
```

## Following run:

```bash
ant clean all
ant initialize
hybrisserver.bat (.sh if you are using linux)
```
## Once started up, go to spartacus folder \js-storefront\spartacusstore and run:
```bash
yarn start
```
Enter to http://localhost:4200/