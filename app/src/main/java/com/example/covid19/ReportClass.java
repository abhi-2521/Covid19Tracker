package com.example.covid19;

import com.google.gson.annotations.SerializedName;

public class ReportClass {


    @SerializedName("updated")
    private float updated;
        private String country;
        CountryInfo CountryInfoObject;
        private float cases;
        private float todayCases;
        private float deaths;
        private float todayDeaths;
        private float recovered;
        private float todayRecovered;
        private float active;
        private float critical;
        private float casesPerOneMillion;
        private float deathsPerOneMillion;
        private float tests;
        private float testsPerOneMillion;
        private float population;
        private String continent;
        private float oneCasePerPeople;
        private float oneDeathPerPeople;
        private float oneTestPerPeople;
        private float activePerOneMillion;
        private float recoveredPerOneMillion;
        private float criticalPerOneMillion;


        // Getter Methods

        public float getUpdated() {
            return updated;
        }

        public String getCountry() {
            return country;
        }

        public CountryInfo getCountryInfo() {
            return CountryInfoObject;
        }

        public float getCases() {
            return cases;
        }

        public float getTodayCases() {
            return todayCases;
        }

        public float getDeaths() {
            return deaths;
        }

        public float getTodayDeaths() {
            return todayDeaths;
        }

        public float getRecovered() {
            return recovered;
        }

        public float getTodayRecovered() {
            return todayRecovered;
        }

        public float getActive() {
            return active;
        }

        public float getCritical() {
            return critical;
        }

        public float getCasesPerOneMillion() {
            return casesPerOneMillion;
        }

        public float getDeathsPerOneMillion() {
            return deathsPerOneMillion;
        }

        public float getTests() {
            return tests;
        }

        public float getTestsPerOneMillion() {
            return testsPerOneMillion;
        }

        public float getPopulation() {
            return population;
        }

        public String getContinent() {
            return continent;
        }

        public float getOneCasePerPeople() {
            return oneCasePerPeople;
        }

        public float getOneDeathPerPeople() {
            return oneDeathPerPeople;
        }

        public float getOneTestPerPeople() {
            return oneTestPerPeople;
        }

        public float getActivePerOneMillion() {
            return activePerOneMillion;
        }

        public float getRecoveredPerOneMillion() {
            return recoveredPerOneMillion;
        }

        public float getCriticalPerOneMillion() {
            return criticalPerOneMillion;
        }

        // Setter Methods

        public void setUpdated(float updated) {
            this.updated = updated;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public void setCountryInfo(CountryInfo countryInfoObject) {
            this.CountryInfoObject = countryInfoObject;
        }

        public void setCases(float cases) {
            this.cases = cases;
        }

        public void setTodayCases(float todayCases) {
            this.todayCases = todayCases;
        }

        public void setDeaths(float deaths) {
            this.deaths = deaths;
        }

        public void setTodayDeaths(float todayDeaths) {
            this.todayDeaths = todayDeaths;
        }

        public void setRecovered(float recovered) {
            this.recovered = recovered;
        }

        public void setTodayRecovered(float todayRecovered) {
            this.todayRecovered = todayRecovered;
        }

        public void setActive(float active) {
            this.active = active;
        }

        public void setCritical(float critical) {
            this.critical = critical;
        }

        public void setCasesPerOneMillion(float casesPerOneMillion) {
            this.casesPerOneMillion = casesPerOneMillion;
        }

        public void setDeathsPerOneMillion(float deathsPerOneMillion) {
            this.deathsPerOneMillion = deathsPerOneMillion;
        }

        public void setTests(float tests) {
            this.tests = tests;
        }

        public void setTestsPerOneMillion(float testsPerOneMillion) {
            this.testsPerOneMillion = testsPerOneMillion;
        }

        public void setPopulation(float population) {
            this.population = population;
        }

        public void setContinent(String continent) {
            this.continent = continent;
        }

        public void setOneCasePerPeople(float oneCasePerPeople) {
            this.oneCasePerPeople = oneCasePerPeople;
        }

        public void setOneDeathPerPeople(float oneDeathPerPeople) {
            this.oneDeathPerPeople = oneDeathPerPeople;
        }

        public void setOneTestPerPeople(float oneTestPerPeople) {
            this.oneTestPerPeople = oneTestPerPeople;
        }

        public void setActivePerOneMillion(float activePerOneMillion) {
            this.activePerOneMillion = activePerOneMillion;
        }

        public void setRecoveredPerOneMillion(float recoveredPerOneMillion) {
            this.recoveredPerOneMillion = recoveredPerOneMillion;
        }

        public void setCriticalPerOneMillion(float criticalPerOneMillion) {
            this.criticalPerOneMillion = criticalPerOneMillion;
        }
    }
