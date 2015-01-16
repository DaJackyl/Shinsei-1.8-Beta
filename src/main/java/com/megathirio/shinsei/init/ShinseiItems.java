package com.megathirio.shinsei.init;

import com.megathirio.shinsei.items.dusts.*;
import com.megathirio.shinsei.items.fuels.*;
import com.megathirio.shinsei.items.gems.*;
import com.megathirio.shinsei.items.nuggets.*;

public class ShinseiItems {

//Variable Intitializations
    //Fuels
        public static FuelShinsei split_wood = new FuelSplitWood();
        public static FuelShinsei coke = new FuelCoke();
    //Dusts
        public static DustShinsei chalk_dust = new DustChalk();
        public static DustShinsei borax_dust = new DustBorax();
        public static DustShinsei graphite_dust = new DustGraphite();
        public static DustShinsei gypsum_dust = new DustGypsum();
        public static DustShinsei salt = new DustSalt();
        public static DustShinsei silt = new DustSilt();
        public static DustShinsei sulphur_dust = new DustSulphur();
        public static DustShinsei uranium_dust = new DustUranium();
    //Gems
        public static GemShinsei amethyst_gem = new GemAmethyst();
        public static GemShinsei apatite_gem = new GemApatite();
        public static GemShinsei aquamarine_gem = new GemAquamarine();
        public static GemShinsei fluorite_gem = new GemFluorite();
        public static GemShinsei jade_gem = new GemJade();
        public static GemShinsei onyx_gem = new GemOnyx();
        public static GemShinsei opal_gem = new GemOpal();
        public static GemShinsei peridot_gem = new GemPeridot();
        public static GemShinsei ruby_gem = new GemRuby();
        public static GemShinsei sapphire_gem = new GemSapphire();
        public static GemShinsei scarlet_emerald_gem = new GemScarletEmerald();
        public static GemShinsei topaz_gem = new GemTopaz();
        public static GemShinsei turquoise_gem = new GemTurquoise();
    //Nuggets
        public static NuggetShinsei barium_nugget = new NuggetBarium();
        public static NuggetShinsei chromium_nugget = new NuggetChromium();
        public static NuggetShinsei cobalt_nugget = new NuggetCobalt();
        public static NuggetShinsei indium_nugget = new NuggetIndium();
        public static NuggetShinsei iridium_nugget = new NuggetIridium();
        public static NuggetShinsei iron_nugget = new NuggetIron();
        public static NuggetShinsei nickel_nugget = new NuggetNickel();
        public static NuggetShinsei platinum_nugget = new NuggetPlatinum();
        public static NuggetShinsei silver_nugget = new NuggetSilver();

//Registers renders for Items
    public static void registerRenders(){
    //Fuels
        FuelSplitWood.registerRender(split_wood);
        FuelCoke.registerRender(coke);
    //Dusts
        DustBorax.registerRender(borax_dust);
        DustChalk.registerRender(chalk_dust);
        DustGraphite.registerRender(graphite_dust);
        DustGypsum.registerRender(gypsum_dust);
        DustSalt.registerRender(salt);
        DustSilt.registerRender(silt);
        DustSulphur.registerRender(sulphur_dust);
        DustUranium.registerRender(uranium_dust);
    //Gems
        GemAmethyst.registerRender(amethyst_gem);
        GemApatite.registerRender(apatite_gem);
        GemAquamarine.registerRender(aquamarine_gem);
        GemFluorite.registerRender(fluorite_gem);
        GemJade.registerRender(jade_gem);
        GemOnyx.registerRender(onyx_gem);
        GemOpal.registerRender(opal_gem);
        GemPeridot.registerRender(peridot_gem);
        GemRuby.registerRender(ruby_gem);
        GemSapphire.registerRender(sapphire_gem);
        GemScarletEmerald.registerRender(scarlet_emerald_gem);
        GemTopaz.registerRender(topaz_gem);
        GemTurquoise.registerRender(turquoise_gem);
    //Nuggets
        NuggetBarium.registerRender(barium_nugget);
        NuggetChromium.registerRender(chromium_nugget);
        NuggetCobalt.registerRender(cobalt_nugget);
        NuggetIndium.registerRender(indium_nugget);
        NuggetIridium.registerRender(iridium_nugget);
        NuggetIron.registerRender(iron_nugget);
        NuggetNickel.registerRender(nickel_nugget);
        NuggetPlatinum.registerRender(platinum_nugget);
        NuggetSilver.registerRender(silver_nugget);
    }
}
