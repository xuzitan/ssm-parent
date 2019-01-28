package com.xzy.controller;

import com.xzy.pojo.TbItem;
import com.xzy.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ItemController {
    @Autowired
    private ItemService itemService;
    @RequestMapping("/item/{itemId}")
    @ResponseBody
    private TbItem fun(@PathVariable Long itemId)
    {
        TbItem tbItem = itemService.getItemById(itemId);
        return tbItem;
    }
}
