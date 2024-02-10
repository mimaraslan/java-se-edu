package com.mimaraslan.mapper;

import com.mimaraslan.dto.request.DoRegisterRequestDto;
import com.mimaraslan.dto.request.UserProfileSaveRequestDto;
import com.mimaraslan.model.Auth;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper (componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IAuthMapper {
    IAuthMapper INSTANCE = Mappers.getMapper(IAuthMapper.class);
    Auth toAuth(final DoRegisterRequestDto dto);

    /*
    @Mappings({
            @Mapping(target = "firstname", source = "fname"),
            @Mapping(target = "lastname", source = "lname")
    })
    */
    @Mapping(target = "authId", source = "id")
    UserProfileSaveRequestDto toDto (final Auth auth);

}
