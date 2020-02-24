/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

public class StatsObjeto {

    private double FlatHPPoolMod, rFlatHPModPerLevel, FlatMPPoolMod, rFlatMPModPerLevel, PercentHPPoolMod, PercentMPPoolMod,
            FlatHPRegenMod, rFlatHPRegenModPerLevel, PercentHPRegenMod, FlatMPRegenMod, rFlatMPRegenModPerLevel, PercentMPRegenMod,
            FlatArmorMod, rFlatArmorModPerLevel, PercentArmorMod, rFlatArmorPenetrationMod, rFlatArmorPenetrationModPerLevel,
            rPercentArmorPenetrationMod, rPercentArmorPenetrationModPerLevel, FlatPhysicalDamageMod, rFlatPhysicalDamageModPerLevel,
            PercentPhysicalDamageMod, FlatMagicDamageMod, rFlatMagicDamageModPerLevel, PercentMagicDamageMod, FlatMovementSpeedMod,
            rFlatMovementSpeedModPerLevel, PercentMovementSpeedMod, rPercentMovementSpeedModPerLevel, FlatAttackSpeedMod, PercentAttackSpeedMod,
            rPercentAttackSpeedModPerLevel, rFlatDodgeMod, rFlatDodgeModPerLevel, PercentDodgeMod, FlatCritChanceMod, rFlatCritChanceModPerLevel,
            PercentCritChanceMod, FlatCritDamageMod, rFlatCritDamageModPerLevel, PercentCritDamageMod, FlatBlockMod, PercentBlockMod,
            FlatSpellBlockMod, rFlatSpellBlockModPerLevel, PercentSpellBlockMod, FlatEXPBonus, PercentEXPBonus, rPercentCooldownMod,
            rPercentCooldownModPerLevel, rFlatTimeDeadMod, rFlatTimeDeadModPerLevel, rPercentTimeDeadMod, rPercentTimeDeadModPerLevel,
            rFlatGoldPer10Mod, rFlatMagicPenetrationMod, rFlatMagicPenetrationModPerLevel, rPercentMagicPenetrationMod,
            rPercentMagicPenetrationModPerLevel, FlatEnergyRegenMod, rFlatEnergyRegenModPerLevel, FlatEnergyPoolMod, rFlatEnergyModPerLevel,
            PercentLifeStealMod, PercentSpellVampMod;

    public StatsObjeto(double flatHPPoolMod, double rFlatHPModPerLevel, double flatMPPoolMod,
            double rFlatMPModPerLevel, double percentHPPoolMod, double percentMPPoolMod, double flatHPRegenMod,
            double rFlatHPRegenModPerLevel, double percentHPRegenMod, double flatMPRegenMod,
            double rFlatMPRegenModPerLevel, double percentMPRegenMod, double flatArmorMod, double rFlatArmorModPerLevel,
            double percentArmorMod, double rFlatArmorPenetrationMod, double rFlatArmorPenetrationModPerLevel,
            double rPercentArmorPenetrationMod, double rPercentArmorPenetrationModPerLevel,
            double flatPhysicalDamageMod, double rFlatPhysicalDamageModPerLevel, double percentPhysicalDamageMod,
            double flatMagicDamageMod, double rFlatMagicDamageModPerLevel, double percentMagicDamageMod,
            double flatMovementSpeedMod, double rFlatMovementSpeedModPerLevel, double percentMovementSpeedMod,
            double rPercentMovementSpeedModPerLevel, double flatAttackSpeedMod, double percentAttackSpeedMod,
            double rPercentAttackSpeedModPerLevel, double rFlatDodgeMod, double rFlatDodgeModPerLevel,
            double percentDodgeMod, double flatCritChanceMod, double rFlatCritChanceModPerLevel,
            double percentCritChanceMod, double flatCritDamageMod, double rFlatCritDamageModPerLevel,
            double percentCritDamageMod, double flatBlockMod, double percentBlockMod, double flatSpellBlockMod,
            double rFlatSpellBlockModPerLevel, double percentSpellBlockMod, double flatEXPBonus, double percentEXPBonus,
            double rPercentCooldownMod, double rPercentCooldownModPerLevel, double rFlatTimeDeadMod,
            double rFlatTimeDeadModPerLevel, double rPercentTimeDeadMod, double rPercentTimeDeadModPerLevel,
            double rFlatGoldPer10Mod, double rFlatMagicPenetrationMod, double rFlatMagicPenetrationModPerLevel,
            double rPercentMagicPenetrationMod, double rPercentMagicPenetrationModPerLevel, double flatEnergyRegenMod,
            double rFlatEnergyRegenModPerLevel, double flatEnergyPoolMod, double rFlatEnergyModPerLevel,
            double percentLifeStealMod, double percentSpellVampMod) {
        super();
        FlatHPPoolMod = flatHPPoolMod;
        this.rFlatHPModPerLevel = rFlatHPModPerLevel;
        FlatMPPoolMod = flatMPPoolMod;
        this.rFlatMPModPerLevel = rFlatMPModPerLevel;
        PercentHPPoolMod = percentHPPoolMod;
        PercentMPPoolMod = percentMPPoolMod;
        FlatHPRegenMod = flatHPRegenMod;
        this.rFlatHPRegenModPerLevel = rFlatHPRegenModPerLevel;
        PercentHPRegenMod = percentHPRegenMod;
        FlatMPRegenMod = flatMPRegenMod;
        this.rFlatMPRegenModPerLevel = rFlatMPRegenModPerLevel;
        PercentMPRegenMod = percentMPRegenMod;
        FlatArmorMod = flatArmorMod;
        this.rFlatArmorModPerLevel = rFlatArmorModPerLevel;
        PercentArmorMod = percentArmorMod;
        this.rFlatArmorPenetrationMod = rFlatArmorPenetrationMod;
        this.rFlatArmorPenetrationModPerLevel = rFlatArmorPenetrationModPerLevel;
        this.rPercentArmorPenetrationMod = rPercentArmorPenetrationMod;
        this.rPercentArmorPenetrationModPerLevel = rPercentArmorPenetrationModPerLevel;
        FlatPhysicalDamageMod = flatPhysicalDamageMod;
        this.rFlatPhysicalDamageModPerLevel = rFlatPhysicalDamageModPerLevel;
        PercentPhysicalDamageMod = percentPhysicalDamageMod;
        FlatMagicDamageMod = flatMagicDamageMod;
        this.rFlatMagicDamageModPerLevel = rFlatMagicDamageModPerLevel;
        PercentMagicDamageMod = percentMagicDamageMod;
        FlatMovementSpeedMod = flatMovementSpeedMod;
        this.rFlatMovementSpeedModPerLevel = rFlatMovementSpeedModPerLevel;
        PercentMovementSpeedMod = percentMovementSpeedMod;
        this.rPercentMovementSpeedModPerLevel = rPercentMovementSpeedModPerLevel;
        FlatAttackSpeedMod = flatAttackSpeedMod;
        PercentAttackSpeedMod = percentAttackSpeedMod;
        this.rPercentAttackSpeedModPerLevel = rPercentAttackSpeedModPerLevel;
        this.rFlatDodgeMod = rFlatDodgeMod;
        this.rFlatDodgeModPerLevel = rFlatDodgeModPerLevel;
        PercentDodgeMod = percentDodgeMod;
        FlatCritChanceMod = flatCritChanceMod;
        this.rFlatCritChanceModPerLevel = rFlatCritChanceModPerLevel;
        PercentCritChanceMod = percentCritChanceMod;
        FlatCritDamageMod = flatCritDamageMod;
        this.rFlatCritDamageModPerLevel = rFlatCritDamageModPerLevel;
        PercentCritDamageMod = percentCritDamageMod;
        FlatBlockMod = flatBlockMod;
        PercentBlockMod = percentBlockMod;
        FlatSpellBlockMod = flatSpellBlockMod;
        this.rFlatSpellBlockModPerLevel = rFlatSpellBlockModPerLevel;
        PercentSpellBlockMod = percentSpellBlockMod;
        FlatEXPBonus = flatEXPBonus;
        PercentEXPBonus = percentEXPBonus;
        this.rPercentCooldownMod = rPercentCooldownMod;
        this.rPercentCooldownModPerLevel = rPercentCooldownModPerLevel;
        this.rFlatTimeDeadMod = rFlatTimeDeadMod;
        this.rFlatTimeDeadModPerLevel = rFlatTimeDeadModPerLevel;
        this.rPercentTimeDeadMod = rPercentTimeDeadMod;
        this.rPercentTimeDeadModPerLevel = rPercentTimeDeadModPerLevel;
        this.rFlatGoldPer10Mod = rFlatGoldPer10Mod;
        this.rFlatMagicPenetrationMod = rFlatMagicPenetrationMod;
        this.rFlatMagicPenetrationModPerLevel = rFlatMagicPenetrationModPerLevel;
        this.rPercentMagicPenetrationMod = rPercentMagicPenetrationMod;
        this.rPercentMagicPenetrationModPerLevel = rPercentMagicPenetrationModPerLevel;
        FlatEnergyRegenMod = flatEnergyRegenMod;
        this.rFlatEnergyRegenModPerLevel = rFlatEnergyRegenModPerLevel;
        FlatEnergyPoolMod = flatEnergyPoolMod;
        this.rFlatEnergyModPerLevel = rFlatEnergyModPerLevel;
        PercentLifeStealMod = percentLifeStealMod;
        PercentSpellVampMod = percentSpellVampMod;
    }

    public double getFlatHPPoolMod() {
        return FlatHPPoolMod;
    }

    public double getrFlatHPModPerLevel() {
        return rFlatHPModPerLevel;
    }

    public double getFlatMPPoolMod() {
        return FlatMPPoolMod;
    }

    public double getrFlatMPModPerLevel() {
        return rFlatMPModPerLevel;
    }

    public double getPercentHPPoolMod() {
        return PercentHPPoolMod;
    }

    public double getPercentMPPoolMod() {
        return PercentMPPoolMod;
    }

    public double getFlatHPRegenMod() {
        return FlatHPRegenMod;
    }

    public double getrFlatHPRegenModPerLevel() {
        return rFlatHPRegenModPerLevel;
    }

    public double getPercentHPRegenMod() {
        return PercentHPRegenMod;
    }

    public double getFlatMPRegenMod() {
        return FlatMPRegenMod;
    }

    public double getrFlatMPRegenModPerLevel() {
        return rFlatMPRegenModPerLevel;
    }

    public double getPercentMPRegenMod() {
        return PercentMPRegenMod;
    }

    public double getFlatArmorMod() {
        return FlatArmorMod;
    }

    public double getrFlatArmorModPerLevel() {
        return rFlatArmorModPerLevel;
    }

    public double getPercentArmorMod() {
        return PercentArmorMod;
    }

    public double getrFlatArmorPenetrationMod() {
        return rFlatArmorPenetrationMod;
    }

    public double getrFlatArmorPenetrationModPerLevel() {
        return rFlatArmorPenetrationModPerLevel;
    }

    public double getrPercentArmorPenetrationMod() {
        return rPercentArmorPenetrationMod;
    }

    public double getrPercentArmorPenetrationModPerLevel() {
        return rPercentArmorPenetrationModPerLevel;
    }

    public double getFlatPhysicalDamageMod() {
        return FlatPhysicalDamageMod;
    }

    public double getrFlatPhysicalDamageModPerLevel() {
        return rFlatPhysicalDamageModPerLevel;
    }

    public double getPercentPhysicalDamageMod() {
        return PercentPhysicalDamageMod;
    }

    public double getFlatMagicDamageMod() {
        return FlatMagicDamageMod;
    }

    public double getrFlatMagicDamageModPerLevel() {
        return rFlatMagicDamageModPerLevel;
    }

    public double getPercentMagicDamageMod() {
        return PercentMagicDamageMod;
    }

    public double getFlatMovementSpeedMod() {
        return FlatMovementSpeedMod;
    }

    public double getrFlatMovementSpeedModPerLevel() {
        return rFlatMovementSpeedModPerLevel;
    }

    public double getPercentMovementSpeedMod() {
        return PercentMovementSpeedMod;
    }

    public double getrPercentMovementSpeedModPerLevel() {
        return rPercentMovementSpeedModPerLevel;
    }

    public double getFlatAttackSpeedMod() {
        return FlatAttackSpeedMod;
    }

    public double getPercentAttackSpeedMod() {
        return PercentAttackSpeedMod;
    }

    public double getrPercentAttackSpeedModPerLevel() {
        return rPercentAttackSpeedModPerLevel;
    }

    public double getrFlatDodgeMod() {
        return rFlatDodgeMod;
    }

    public double getrFlatDodgeModPerLevel() {
        return rFlatDodgeModPerLevel;
    }

    public double getPercentDodgeMod() {
        return PercentDodgeMod;
    }

    public double getFlatCritChanceMod() {
        return FlatCritChanceMod;
    }

    public double getrFlatCritChanceModPerLevel() {
        return rFlatCritChanceModPerLevel;
    }

    public double getPercentCritChanceMod() {
        return PercentCritChanceMod;
    }

    public double getFlatCritDamageMod() {
        return FlatCritDamageMod;
    }

    public double getrFlatCritDamageModPerLevel() {
        return rFlatCritDamageModPerLevel;
    }

    public double getPercentCritDamageMod() {
        return PercentCritDamageMod;
    }

    public double getFlatBlockMod() {
        return FlatBlockMod;
    }

    public double getPercentBlockMod() {
        return PercentBlockMod;
    }

    public double getFlatSpellBlockMod() {
        return FlatSpellBlockMod;
    }

    public double getrFlatSpellBlockModPerLevel() {
        return rFlatSpellBlockModPerLevel;
    }

    public double getPercentSpellBlockMod() {
        return PercentSpellBlockMod;
    }

    public double getFlatEXPBonus() {
        return FlatEXPBonus;
    }

    public double getPercentEXPBonus() {
        return PercentEXPBonus;
    }

    public double getrPercentCooldownMod() {
        return rPercentCooldownMod;
    }

    public double getrPercentCooldownModPerLevel() {
        return rPercentCooldownModPerLevel;
    }

    public double getrFlatTimeDeadMod() {
        return rFlatTimeDeadMod;
    }

    public double getrFlatTimeDeadModPerLevel() {
        return rFlatTimeDeadModPerLevel;
    }

    public double getrPercentTimeDeadMod() {
        return rPercentTimeDeadMod;
    }

    public double getrPercentTimeDeadModPerLevel() {
        return rPercentTimeDeadModPerLevel;
    }

    public double getrFlatGoldPer10Mod() {
        return rFlatGoldPer10Mod;
    }

    public double getrFlatMagicPenetrationMod() {
        return rFlatMagicPenetrationMod;
    }

    public double getrFlatMagicPenetrationModPerLevel() {
        return rFlatMagicPenetrationModPerLevel;
    }

    public double getrPercentMagicPenetrationMod() {
        return rPercentMagicPenetrationMod;
    }

    public double getrPercentMagicPenetrationModPerLevel() {
        return rPercentMagicPenetrationModPerLevel;
    }

    public double getFlatEnergyRegenMod() {
        return FlatEnergyRegenMod;
    }

    public double getrFlatEnergyRegenModPerLevel() {
        return rFlatEnergyRegenModPerLevel;
    }

    public double getFlatEnergyPoolMod() {
        return FlatEnergyPoolMod;
    }

    public double getrFlatEnergyModPerLevel() {
        return rFlatEnergyModPerLevel;
    }

    public double getPercentLifeStealMod() {
        return PercentLifeStealMod;
    }

    public double getPercentSpellVampMod() {
        return PercentSpellVampMod;
    }

    public void setFlatHPPoolMod(double flatHPPoolMod) {
        FlatHPPoolMod = flatHPPoolMod;
    }

    public void setrFlatHPModPerLevel(double rFlatHPModPerLevel) {
        this.rFlatHPModPerLevel = rFlatHPModPerLevel;
    }

    public void setFlatMPPoolMod(double flatMPPoolMod) {
        FlatMPPoolMod = flatMPPoolMod;
    }

    public void setrFlatMPModPerLevel(double rFlatMPModPerLevel) {
        this.rFlatMPModPerLevel = rFlatMPModPerLevel;
    }

    public void setPercentHPPoolMod(double percentHPPoolMod) {
        PercentHPPoolMod = percentHPPoolMod;
    }

    public void setPercentMPPoolMod(double percentMPPoolMod) {
        PercentMPPoolMod = percentMPPoolMod;
    }

    public void setFlatHPRegenMod(double flatHPRegenMod) {
        FlatHPRegenMod = flatHPRegenMod;
    }

    public void setrFlatHPRegenModPerLevel(double rFlatHPRegenModPerLevel) {
        this.rFlatHPRegenModPerLevel = rFlatHPRegenModPerLevel;
    }

    public void setPercentHPRegenMod(double percentHPRegenMod) {
        PercentHPRegenMod = percentHPRegenMod;
    }

    public void setFlatMPRegenMod(double flatMPRegenMod) {
        FlatMPRegenMod = flatMPRegenMod;
    }

    public void setrFlatMPRegenModPerLevel(double rFlatMPRegenModPerLevel) {
        this.rFlatMPRegenModPerLevel = rFlatMPRegenModPerLevel;
    }

    public void setPercentMPRegenMod(double percentMPRegenMod) {
        PercentMPRegenMod = percentMPRegenMod;
    }

    public void setFlatArmorMod(double flatArmorMod) {
        FlatArmorMod = flatArmorMod;
    }

    public void setrFlatArmorModPerLevel(double rFlatArmorModPerLevel) {
        this.rFlatArmorModPerLevel = rFlatArmorModPerLevel;
    }

    public void setPercentArmorMod(double percentArmorMod) {
        PercentArmorMod = percentArmorMod;
    }

    public void setrFlatArmorPenetrationMod(double rFlatArmorPenetrationMod) {
        this.rFlatArmorPenetrationMod = rFlatArmorPenetrationMod;
    }

    public void setrFlatArmorPenetrationModPerLevel(double rFlatArmorPenetrationModPerLevel) {
        this.rFlatArmorPenetrationModPerLevel = rFlatArmorPenetrationModPerLevel;
    }

    public void setrPercentArmorPenetrationMod(double rPercentArmorPenetrationMod) {
        this.rPercentArmorPenetrationMod = rPercentArmorPenetrationMod;
    }

    public void setrPercentArmorPenetrationModPerLevel(double rPercentArmorPenetrationModPerLevel) {
        this.rPercentArmorPenetrationModPerLevel = rPercentArmorPenetrationModPerLevel;
    }

    public void setFlatPhysicalDamageMod(double flatPhysicalDamageMod) {
        FlatPhysicalDamageMod = flatPhysicalDamageMod;
    }

    public void setrFlatPhysicalDamageModPerLevel(double rFlatPhysicalDamageModPerLevel) {
        this.rFlatPhysicalDamageModPerLevel = rFlatPhysicalDamageModPerLevel;
    }

    public void setPercentPhysicalDamageMod(double percentPhysicalDamageMod) {
        PercentPhysicalDamageMod = percentPhysicalDamageMod;
    }

    public void setFlatMagicDamageMod(double flatMagicDamageMod) {
        FlatMagicDamageMod = flatMagicDamageMod;
    }

    public void setrFlatMagicDamageModPerLevel(double rFlatMagicDamageModPerLevel) {
        this.rFlatMagicDamageModPerLevel = rFlatMagicDamageModPerLevel;
    }

    public void setPercentMagicDamageMod(double percentMagicDamageMod) {
        PercentMagicDamageMod = percentMagicDamageMod;
    }

    public void setFlatMovementSpeedMod(double flatMovementSpeedMod) {
        FlatMovementSpeedMod = flatMovementSpeedMod;
    }

    public void setrFlatMovementSpeedModPerLevel(double rFlatMovementSpeedModPerLevel) {
        this.rFlatMovementSpeedModPerLevel = rFlatMovementSpeedModPerLevel;
    }

    public void setPercentMovementSpeedMod(double percentMovementSpeedMod) {
        PercentMovementSpeedMod = percentMovementSpeedMod;
    }

    public void setrPercentMovementSpeedModPerLevel(double rPercentMovementSpeedModPerLevel) {
        this.rPercentMovementSpeedModPerLevel = rPercentMovementSpeedModPerLevel;
    }

    public void setFlatAttackSpeedMod(double flatAttackSpeedMod) {
        FlatAttackSpeedMod = flatAttackSpeedMod;
    }

    public void setPercentAttackSpeedMod(double percentAttackSpeedMod) {
        PercentAttackSpeedMod = percentAttackSpeedMod;
    }

    public void setrPercentAttackSpeedModPerLevel(double rPercentAttackSpeedModPerLevel) {
        this.rPercentAttackSpeedModPerLevel = rPercentAttackSpeedModPerLevel;
    }

    public void setrFlatDodgeMod(double rFlatDodgeMod) {
        this.rFlatDodgeMod = rFlatDodgeMod;
    }

    public void setrFlatDodgeModPerLevel(double rFlatDodgeModPerLevel) {
        this.rFlatDodgeModPerLevel = rFlatDodgeModPerLevel;
    }

    public void setPercentDodgeMod(double percentDodgeMod) {
        PercentDodgeMod = percentDodgeMod;
    }

    public void setFlatCritChanceMod(double flatCritChanceMod) {
        FlatCritChanceMod = flatCritChanceMod;
    }

    public void setrFlatCritChanceModPerLevel(double rFlatCritChanceModPerLevel) {
        this.rFlatCritChanceModPerLevel = rFlatCritChanceModPerLevel;
    }

    public void setPercentCritChanceMod(double percentCritChanceMod) {
        PercentCritChanceMod = percentCritChanceMod;
    }

    public void setFlatCritDamageMod(double flatCritDamageMod) {
        FlatCritDamageMod = flatCritDamageMod;
    }

    public void setrFlatCritDamageModPerLevel(double rFlatCritDamageModPerLevel) {
        this.rFlatCritDamageModPerLevel = rFlatCritDamageModPerLevel;
    }

    public void setPercentCritDamageMod(double percentCritDamageMod) {
        PercentCritDamageMod = percentCritDamageMod;
    }

    public void setFlatBlockMod(double flatBlockMod) {
        FlatBlockMod = flatBlockMod;
    }

    public void setPercentBlockMod(double percentBlockMod) {
        PercentBlockMod = percentBlockMod;
    }

    public void setFlatSpellBlockMod(double flatSpellBlockMod) {
        FlatSpellBlockMod = flatSpellBlockMod;
    }

    public void setrFlatSpellBlockModPerLevel(double rFlatSpellBlockModPerLevel) {
        this.rFlatSpellBlockModPerLevel = rFlatSpellBlockModPerLevel;
    }

    public void setPercentSpellBlockMod(double percentSpellBlockMod) {
        PercentSpellBlockMod = percentSpellBlockMod;
    }

    public void setFlatEXPBonus(double flatEXPBonus) {
        FlatEXPBonus = flatEXPBonus;
    }

    public void setPercentEXPBonus(double percentEXPBonus) {
        PercentEXPBonus = percentEXPBonus;
    }

    public void setrPercentCooldownMod(double rPercentCooldownMod) {
        this.rPercentCooldownMod = rPercentCooldownMod;
    }

    public void setrPercentCooldownModPerLevel(double rPercentCooldownModPerLevel) {
        this.rPercentCooldownModPerLevel = rPercentCooldownModPerLevel;
    }

    public void setrFlatTimeDeadMod(double rFlatTimeDeadMod) {
        this.rFlatTimeDeadMod = rFlatTimeDeadMod;
    }

    public void setrFlatTimeDeadModPerLevel(double rFlatTimeDeadModPerLevel) {
        this.rFlatTimeDeadModPerLevel = rFlatTimeDeadModPerLevel;
    }

    public void setrPercentTimeDeadMod(double rPercentTimeDeadMod) {
        this.rPercentTimeDeadMod = rPercentTimeDeadMod;
    }

    public void setrPercentTimeDeadModPerLevel(double rPercentTimeDeadModPerLevel) {
        this.rPercentTimeDeadModPerLevel = rPercentTimeDeadModPerLevel;
    }

    public void setrFlatGoldPer10Mod(double rFlatGoldPer10Mod) {
        this.rFlatGoldPer10Mod = rFlatGoldPer10Mod;
    }

    public void setrFlatMagicPenetrationMod(double rFlatMagicPenetrationMod) {
        this.rFlatMagicPenetrationMod = rFlatMagicPenetrationMod;
    }

    public void setrFlatMagicPenetrationModPerLevel(double rFlatMagicPenetrationModPerLevel) {
        this.rFlatMagicPenetrationModPerLevel = rFlatMagicPenetrationModPerLevel;
    }

    public void setrPercentMagicPenetrationMod(double rPercentMagicPenetrationMod) {
        this.rPercentMagicPenetrationMod = rPercentMagicPenetrationMod;
    }

    public void setrPercentMagicPenetrationModPerLevel(double rPercentMagicPenetrationModPerLevel) {
        this.rPercentMagicPenetrationModPerLevel = rPercentMagicPenetrationModPerLevel;
    }

    public void setFlatEnergyRegenMod(double flatEnergyRegenMod) {
        FlatEnergyRegenMod = flatEnergyRegenMod;
    }

    public void setrFlatEnergyRegenModPerLevel(double rFlatEnergyRegenModPerLevel) {
        this.rFlatEnergyRegenModPerLevel = rFlatEnergyRegenModPerLevel;
    }

    public void setFlatEnergyPoolMod(double flatEnergyPoolMod) {
        FlatEnergyPoolMod = flatEnergyPoolMod;
    }

    public void setrFlatEnergyModPerLevel(double rFlatEnergyModPerLevel) {
        this.rFlatEnergyModPerLevel = rFlatEnergyModPerLevel;
    }

    public void setPercentLifeStealMod(double percentLifeStealMod) {
        PercentLifeStealMod = percentLifeStealMod;
    }

    public void setPercentSpellVampMod(double percentSpellVampMod) {
        PercentSpellVampMod = percentSpellVampMod;
    }
}
