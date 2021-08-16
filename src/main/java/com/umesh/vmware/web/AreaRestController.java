package com.umesh.vmware.web;

import com.umesh.vmware.Type;
import com.umesh.vmware.dtos.AreaRequestDTO;
import com.umesh.vmware.dtos.ResponseDto;
import com.umesh.vmware.service.AreaCalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/area/")
public class AreaRestController {

    @Autowired
    private AreaCalService areaCalService;

    @PostMapping("")
    ResponseDto calculateArea(@RequestBody AreaRequestDTO areaRequestDTO){
        return areaCalService.area(areaRequestDTO);
    }

}
