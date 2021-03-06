package com.megathirio.shinsei.init;

import com.megathirio.shinsei.blocks.*;
import com.megathirio.shinsei.blocks.machines.MachineAnbiru;
import com.megathirio.shinsei.blocks.machines.MachineShinsei;
import com.megathirio.shinsei.blocks.minerals.*;
import com.megathirio.shinsei.blocks.ores.*;

public class ShinseiBlocks {

    //Variable Intitializations
    //Blocks
    public static BlockShinsei aluminum_block = new BlockAluminum();
    public static BlockShinsei amethyst_block = new BlockAmethyst();
    public static BlockShinsei antimony_block = new BlockAntimony();
    public static BlockShinsei apatite_block = new BlockApatite();
    public static BlockShinsei aquamarine_block = new BlockAquamarine();
    public static BlockShinsei barium_block = new BlockBarium();
    public static BlockShinsei bismuth_block = new BlockBismuth();
    public static BlockShinsei brass_block = new BlockBrass();
    public static BlockShinsei bronze_block = new BlockBronze();
    public static BlockShinsei chromium_block = new BlockChromium();
    public static BlockShinsei cobalt_block = new BlockCobalt();
    public static BlockShinsei copper_block = new BlockCopper();
    public static BlockShinsei fluorite_block = new BlockFluorite();
    public static BlockShinsei indium_block = new BlockIndium();
    public static BlockShinsei iridium_block = new BlockIridium();
    public static BlockShinsei jade_block = new BlockJade();
    public static BlockShinsei lead_block = new BlockLead();
    public static BlockShinsei magnesium_block = new BlockMagnesium();
    public static BlockShinsei manganese_block = new BlockManganese();
    public static BlockShinsei molybdenum_block = new BlockMolybdenum();
    public static BlockShinsei nickel_block = new BlockNickel();
    public static BlockShinsei opal_block = new BlockOpal();
    public static BlockShinsei onyx_block = new BlockOnyx();
    public static BlockShinsei peridot_block = new BlockPeridot();
    public static BlockShinsei platinum_block = new BlockPlatinum();
    public static BlockShinsei ruby_block = new BlockRuby();
    public static BlockShinsei sapphire_block = new BlockSapphire();
    public static BlockShinsei scarlet_emerald_block = new BlockScarletEmerald();
    public static BlockShinsei silver_block = new BlockSilver();
    public static BlockShinsei stainless_steel_block = new BlockStainlessSteel();
    public static BlockShinsei steel_block = new BlockSteel();
    public static BlockShinsei tantalum_block = new BlockTantalum();
    public static BlockShinsei tin_block = new BlockTin();
    public static BlockShinsei titanium_block = new BlockTitanium();
    public static BlockShinsei topaz_block = new BlockTopaz();
    public static BlockShinsei tungsten_block = new BlockTungsten();
    public static BlockShinsei turquoise_block = new BlockTurquoise();
    public static BlockShinsei vanadium_block = new BlockVanadium();
    public static BlockShinsei zinc_block = new BlockZinc();
    //Minerals
    public static MineralShinsei basalt_block = new MineralBasalt();
    public static MineralShinsei basalt_cobble_block = new MineralBasaltCobble();
    public static MineralShinsei borax_block = new MineralBorax();
    public static MineralShinsei chalk_block = new MineralChalk();
    public static MineralShinsei gypsum_block = new MineralGypsum();
    public static MineralShinsei halite_block = new MineralHalite();
    public static MineralShinsei limestone_block = new MineralLimestone();
    public static MineralShinsei siltstone_block = new MineralSiltstone();
    //Ores
    public static OreShinsei acanthite_ore = new OreAcanthite();
    public static OreShinsei amethyst_ore = new OreAmethyst();
    public static OreShinsei apatite_ore = new OreApatite();
    public static OreShinsei barite_ore = new OreBarite();
    public static OreShinsei bauxite_ore = new OreBauxite();
    public static OreShinsei beryl_ore = new OreBeryl();
    public static OreShinsei bismuth_ore = new OreBismuth();
    public static OreShinsei bornite_ore = new OreBornite();
    public static OreShinsei cassiterite_ore = new OreCassiterite();
    public static OreShinsei chalcedony_ore = new OreChalcedony();
    public static OreShinsei chalcopyrite_ore = new OreChalcopyrite();
    public static OreShinsei chromite_ore = new OreChromite();
    public static OreShinsei cinnabar_ore = new OreCinnabar();
    public static OreShinsei cobaltite_ore = new OreCobaltite();
    public static OreShinsei corundum_ore = new OreCorundum();
    public static OreShinsei cryolite_ore = new OreCryolite();
    public static OreShinsei dolomite_ore = new OreDolomite();
    public static OreShinsei fluorite_ore = new OreFluorite();
    public static OreShinsei galena_ore = new OreGalena();
    public static OreShinsei graphite_ore = new OreGraphite();
    public static OreShinsei hematite_ore = new OreHematite();
    public static OreShinsei ilmenite_ore = new OreIlmenite();
    public static OreShinsei jadeite_ore = new OreJadeite();
    public static OreShinsei meteorite_ore = new OreMeteorite();
    public static OreShinsei molybdenite_ore = new OreMolybdenite();
    public static OreShinsei olivine_ore = new OreOlivine();
    public static OreShinsei opal_ore = new OreOpal();
    public static OreShinsei pentlandite_ore = new OrePentlandite();
    public static OreShinsei pyrolusite_ore = new OrePyrolusite();
    public static OreShinsei realgar_ore = new OreRealgar();
    public static OreShinsei rutile_ore = new OreRutile();
    public static OreShinsei scheelite_ore = new OreScheelite();
    public static OreShinsei sperrylite_ore = new OreSperrylite();
    public static OreShinsei sphalerite_ore = new OreSphalerite();
    public static OreShinsei stibnite_ore = new OreStibnite();
    public static OreShinsei sulphur_ore = new OreSulphur();
    public static OreShinsei sylvite_ore = new OreSylvite();
    public static OreShinsei tantalite_ore = new OreTantalite();
    public static OreShinsei topaz_ore = new OreTopaz();
    public static OreShinsei turquoise_ore = new OreTurquoise();
    public static OreShinsei uraninite_ore = new OreUraninite();
    //Machines
    public static MachineShinsei anbiru = new MachineAnbiru();

    public static void createBlocks(){

    }

    //Registers renders for Blocks
    public static void registerRenders() {
        //Blocks
        BlockAluminum.registerRender(aluminum_block);
        BlockAmethyst.registerRender(amethyst_block);
        BlockAntimony.registerRender(antimony_block);
        BlockApatite.registerRender(apatite_block);
        BlockAquamarine.registerRender(aquamarine_block);
        BlockBarium.registerRender(barium_block);
        BlockBismuth.registerRender(bismuth_block);
        BlockBrass.registerRender(brass_block);
        BlockBronze.registerRender(bronze_block);
        MineralChalk.registerRender(chalk_block);
        BlockChromium.registerRender(chromium_block);
        BlockCobalt.registerRender(cobalt_block);
        BlockCopper.registerRender(copper_block);
        BlockFluorite.registerRender(fluorite_block);
        BlockIndium.registerRender(indium_block);
        BlockIridium.registerRender(iridium_block);
        BlockJade.registerRender(jade_block);
        BlockLead.registerRender(lead_block);
        BlockMagnesium.registerRender(magnesium_block);
        BlockManganese.registerRender(manganese_block);
        BlockMolybdenum.registerRender(molybdenum_block);
        BlockNickel.registerRender(nickel_block);
        BlockOnyx.registerRender(onyx_block);
        BlockOpal.registerRender(opal_block);
        BlockPeridot.registerRender(peridot_block);
        BlockPlatinum.registerRender(platinum_block);
        BlockRuby.registerRender(ruby_block);
        BlockSapphire.registerRender(sapphire_block);
        BlockScarletEmerald.registerRender(scarlet_emerald_block);
        BlockSilver.registerRender(silver_block);
        BlockStainlessSteel.registerRender(stainless_steel_block);
        BlockSteel.registerRender(steel_block);
        BlockTantalum.registerRender(tantalum_block);
        BlockTin.registerRender(tin_block);
        BlockTitanium.registerRender(titanium_block);
        BlockTungsten.registerRender(tungsten_block);
        BlockTopaz.registerRender(topaz_block);
        BlockTurquoise.registerRender(turquoise_block);
        BlockVanadium.registerRender(vanadium_block);
        BlockZinc.registerRender(zinc_block);
        //Minerals
        MineralBasalt.registerRender(basalt_block);
        MineralBasaltCobble.registerRender(basalt_cobble_block);
        MineralBorax.registerRender(borax_block);
        MineralChalk.registerRender(chalk_block);
        MineralGypsum.registerRender(gypsum_block);
        MineralHalite.registerRender(halite_block);
        MineralLimestone.registerRender(limestone_block);
        MineralSiltstone.registerRender(siltstone_block);
        //Ores
        OreAcanthite.registerRender(acanthite_ore);
        OreAmethyst.registerRender(amethyst_ore);
        OreApatite.registerRender(apatite_ore);
        OreBarite.registerRender(barite_ore);
        OreBauxite.registerRender(bauxite_ore);
        OreBeryl.registerRender(beryl_ore);
        OreBismuth.registerRender(bismuth_ore);
        OreBornite.registerRender(bornite_ore);
        OreCassiterite.registerRender(cassiterite_ore);
        OreChalcedony.registerRender(chalcedony_ore);
        OreChalcopyrite.registerRender(chalcopyrite_ore);
        OreChromite.registerRender(chromite_ore);
        OreCinnabar.registerRender(cinnabar_ore);
        OreCobaltite.registerRender(cobaltite_ore);
        OreCorundum.registerRender(corundum_ore);
        OreCryolite.registerRender(cryolite_ore);
        OreDolomite.registerRender(dolomite_ore);
        OreFluorite.registerRender(fluorite_ore);
        OreGalena.registerRender(galena_ore);
        OreGraphite.registerRender(graphite_ore);
        OreHematite.registerRender(hematite_ore);
        OreIlmenite.registerRender(ilmenite_ore);
        OreJadeite.registerRender(jadeite_ore);
        OreMeteorite.registerRender(meteorite_ore);
        OreMolybdenite.registerRender(molybdenite_ore);
        OreOlivine.registerRender(olivine_ore);
        OreOpal.registerRender(opal_ore);
        OrePentlandite.registerRender(pentlandite_ore);
        OrePyrolusite.registerRender(pyrolusite_ore);
        OreRealgar.registerRender(realgar_ore);
        OreRutile.registerRender(rutile_ore);
        OreScheelite.registerRender(scheelite_ore);
        OreSperrylite.registerRender(sperrylite_ore);
        OreSphalerite.registerRender(sphalerite_ore);
        OreStibnite.registerRender(stibnite_ore);
        OreSulphur.registerRender(sulphur_ore);
        OreSylvite.registerRender(sylvite_ore);
        OreTantalite.registerRender(tantalite_ore);
        OreTopaz.registerRender(topaz_ore);
        OreTurquoise.registerRender(turquoise_ore);
        OreUraninite.registerRender(uraninite_ore);
        //Machines
        MachineAnbiru.registerRender(anbiru);
    }
}
