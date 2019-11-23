package ca.evannosich.Bakery;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class Bakery extends JavaPlugin {

    @Override
    public void onEnable() {

        ItemStack breadItem = new ItemStack(Material.BREAD);

        NamespacedKey breadKey = new NamespacedKey(this, "BREAD");

        float experience = 0.35f;

        int cookingTime = 200;

        FurnaceRecipe breadRecipe = new FurnaceRecipe(breadKey, breadItem, Material.WHEAT, experience, cookingTime);

        Bukkit.addRecipe(breadRecipe);

    }

    @Override
    public void onDisable() {

    }

}
