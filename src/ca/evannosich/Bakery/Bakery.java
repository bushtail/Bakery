package ca.evannosich.Bakery;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.SmokingRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class Bakery extends JavaPlugin {

    @Override
    public void onEnable() {



        ItemStack breadItem = new ItemStack(Material.BREAD);

        NamespacedKey breadKey = new NamespacedKey(this, "BREAD");

        float experience = 0.35f;

        // Furnace

        int cookingTimeFurnace = 200;

        FurnaceRecipe breadRecipeFurnace = new FurnaceRecipe(breadKey, breadItem, Material.WHEAT, experience, cookingTimeFurnace);

        Bukkit.addRecipe(breadRecipeFurnace);

        // Smoker

        int cookingTimeSmoker = 100;

        SmokingRecipe breadRecipeSmoker = new SmokingRecipe(breadKey, breadItem, Material.WHEAT, experience, cookingTimeSmoker);

        Bukkit.addRecipe(breadRecipeSmoker);

    }

    @Override
    public void onDisable() {

    }

}
