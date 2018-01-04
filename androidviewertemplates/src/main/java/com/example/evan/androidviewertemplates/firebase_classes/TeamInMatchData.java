package com.example.evan.androidviewertemplates.firebase_classes;

import com.example.evan.androidviewertools.firebase_classes.*;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by evan on 6/18/16.
 */
public class TeamInMatchData extends com.example.evan.androidviewertools.firebase_classes.TeamInMatchData {
    public CalculatedTeamInMatchData calculatedData;

    public ArrayList<String> scoutName; //<---So sketchy on firebase
    public Boolean didLiftoff;
    public Boolean didStartDisabled;
    public Boolean didGetDisabled; //<---wasnt there before
    public Boolean didBecomeIncapacitated;
    public Integer rankSpeed;
    public Integer rankAgility;
    public Integer rankGearControl;
    public Integer rankBallControl;
    public Integer rankDefense;
    public Object superNotes;

    //AUTO
    public Map<String, Integer> gearsPlacedByLiftAuto;
    public Map<String, Boolean> hoppersOpenedAuto;
    public Integer numGearsFumbledAuto;
    public Integer numGearsEjectedAuto;
    public Integer numHoppersOpenedAuto;
    public Integer numHoppersUsedAuto;//<---wasnt there before
    public Boolean didReachBaselineAuto;
    public Boolean didReachBaseLineAuto;
    public Boolean didPotentiallyConflictingAuto;
    public ArrayList<Map<String, Object>> highShotTimesForBoilerAuto;
    public ArrayList<Map<String, Object>> lowShotTimesForBoilerAuto;

    //TELE
    public Map<String, Integer> gearsPlacedByLiftTele;
    public Map<String, Boolean> hoppersOpenedTele;
    public Integer numGroundGearIntakesTele;//<---wasnt there before
    public Integer numGearGroundIntakesTele;
    public Integer numGearLoaderIntakesTele;
    public Integer numHumanGearIntakesTele;//<---wasnt there before
    public Integer numGearsFumbledTele;
    public Integer numGearsEjectedTele;
    public Integer numHoppersOpenedTele;
    public Integer numHoppersUsedTele;//<---wasnt there before
    public Float liftoffTime;
    public ArrayList<Map<String, Object>> highShotTimesForBoilerTele;
    public ArrayList<Map<String, Object>> lowShotTimesForBoilerTele;
}
