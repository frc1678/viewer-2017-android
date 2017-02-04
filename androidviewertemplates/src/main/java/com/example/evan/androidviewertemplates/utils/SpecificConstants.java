package com.example.evan.androidviewertemplates.utils;

import com.example.evan.androidviewertools.utils.Constants;

import java.util.HashMap;
import java.util.Map;

public class SpecificConstants extends Constants {
    //todo
    public static Map<String, String> KEYS_TO_TITLES;
    public static Map<String, String> DATA_TO_GRAPH;
    //todo
    public static final String[] DRAWER_TITLES = {"Recent Matches", "Upcoming Matches", "Our Schedule", "Starred Matches", "Schedule", "Seeding", "Predicted Seeding", "First Pick", "Overall Second Pick", "Super Data"};
    public static final String ORIGINAL_ROOT_FIREBASE_PATH = "https://scouting-2017-5f51c.firebaseio.com/";
    public static String ROOT_FIREBASE_PATH = ORIGINAL_ROOT_FIREBASE_PATH;
    public static String MATCHES_PATH = ORIGINAL_ROOT_FIREBASE_PATH + "Matches";
    public static String TEAMS_PATH = ORIGINAL_ROOT_FIREBASE_PATH + "Teams";
    public static String TEAM_IN_MATCH_DATAS_PATH = ORIGINAL_ROOT_FIREBASE_PATH + "TeamInMatchDatas";

    static {
        Map<String, String> initialKeysToTitlesMap = new HashMap<String, String>() {
            {
                //MATCH DETAILS ACTIVITY
                put("calculatedData.actualSeed", "Seed");
                put("calculatedData.disfunctionalPercentage", "Disfunctional");
                //TEAM DETAILS SECTION ADAPTER
                    //MATCHES
                put("matches", "Matches");
                put("VIEWER.matchesUntilNextMatchForTeam", "Matches Until Next Match");
                    //STATUS
                put("calculatedData.disabledPercentage", "Disabled");
                put("calculatedData.incapacitatedPercentage", "Incapacitated");
                    //AUTO
                put("calculatedData.avgGearsPlacedAuto", "Avg Gears Placed");
                put("calculatedData.avgHighShotsAuto", "Avg High Shots");
                put("calculatedData.avgLowShotsAuto", "Avg Low Shots");
                put("calculatedData.baselineReachedPercentage", "Baseline Reached Percentage");
                    //TELEOP
                put("calculatedData.avgGearsPlacedTele", "Avg Gears Placed");
                put("calculatedData.avgHighShotsTele", "Avg High Shots");
                put("calculatedData.avgLowShotsTele", "Avg Low Shots");
                put("calculatedData.avgKeyShotTime", "Avg Key Shot Time(Sec.)");
                    //LIFTOFF
                put("calculatedData.liftoffPercentage", "Liftoff Percentage");
                    //HIGH LEVEL
                put("calculatedData.firstPickAbility", "First Pick Ability");
                put("calculatedData.secondPickAbility", "Second Pick Ability");
                put("calculatedData.overallSecondPickAbility", "Overall Second Pick Ability");
                    //SUPER DATA
                put("calculatedData.avgAgility", "Agility");
                put("calculatedData.avgSpeed", "Speed");
                put("calculatedData.avgBallControl", "Ball Control");
                put("calculatedData.avgGearControl", "Gear Control");
                put("calculatedData.avgDefense", "Defense");
                put("calculatedData.avgDrivingAbility", "Driving");
                    //PIT DATA
                put("pitSelectedImageURL", "Selected Image Url");
                put("pitNotes", "Notes");
                put("pitProgrammingLanguage", "Programming Language");
                put("pitAvailableWeight", "Available Weight");
                put("pitOrganization", "Pit Organization");
                put("pitDidUseStandardTankDrive", "Tank Tread");
                put("pitDidDemonstrateCheesecakePotential", "Cheesecake");
                //TEAM IN MATCH DETAILS SECTION ADAPTER
                    //Information
                put("teamNumber", "Team Number");
                put("matchNumber", "Match Number");
                    //Auto
                put("calculatedData.numGearsPlacedAuto", "Gears Placed");
                put("calculatedData.numHoppersOpenedAuto", "Num. Hoppers Opened");
                put("numGearsFumbledAuto", "Gears Fumbled");
                put("numGearsEjectedAuto", "Gears Ejected");
                put("didReachBaselineAuto", "Reach Baseline?");
                    //Tele
                put("calculatedData.numGearsPlacedTele", "Gears Placed");
                put("calculatedData.numHoppersOpenedTele", "Num. Hoppers Opened");
                put("numGearGroundIntakesTele", "Gear Ground Intakes");
                put("numGearLoaderIntakesTele", "Gear Loader Intakes");
                put("numGearsFumbledTele", "Gears Fumbled");
                put("numGearsEjectedTele", "Gears Ejected");
                    //Liftoff
                put("didLiftoff", "Liftoff?");
                    //Super
                put("rankSpeed", "Speed");
                put("rankAgility", "Agility");
                put("rankGearControl", "Gear Control");
                put("rankBallControl", "Ball Control");
                put("rankDefense", "Defense");
                //Super data rank list
                put("CalculatedData.avgAgility", "Agility");
                put("CalculatedData.avgSpeed", "Speed");
                put("CalculatedData.avgBallControl", "Ball Control");
                put("CalculatedData.avgGearControl", "Gear Control");
                put("CalculatedData.avgDefense", "Defense");
                put("CalculatedData.avgDrivingAbility", "Driving");
            }
        };
        Map<String, String> initialDatasToGraphMap = new HashMap<String, String> () {
            {
                put("calculatedData.avgGearsPlacedAuto", "numGearsPlacedAuto");
                put("calculatedData.avgHighShotsAuto", "numHighShotsAuto");
                put("calculatedData.avgLowShotsAuto", "numLowShotsAuto");
                put("calculatedData.avgGearsPlacedTele", "numGearsPlacedTele");
                put("calculatedData.avgHighShotsTele", "numHighShotsTele");
                put("calculatedData.avgLowShotsTele", "numLowShotsTele");
                /*put("calculatedData.avgKeyShotTime", "calculatedData.avgKeyShotTime");
                put("calculatedData.liftoffPercentage", "calculatedData.liftoffPercentage");
                put("calculatedData.disabledPercentage", "calculatedData.disabledPercentage");
                put("calculatedData.incapacitatedPercentage", "calculatedData.incapacitatedPercentage");
                put("calculatedData.baselineReachedPercentage", "calculatedData.baselineReachedPercentage");*/
                put("calculatedData.avgAgility", "rankAgility");
                put("calculatedData.avgSpeed", "rankSpeed");
                put("calculatedData.avgBallControl", "rankBallControl");
                put("calculatedData.avgGearControl", "rankGearControl");
                put("calculatedData.avgDefense", "rankDefense");
                put("calculatedData.avgDrivingAbility", "rankDrivingAbility");

            }
        };
        //replace all 'DEFENSE's with the correct defenses
        KEYS_TO_TITLES = initialKeysToTitlesMap;
        DATA_TO_GRAPH = initialDatasToGraphMap;
    }
}
