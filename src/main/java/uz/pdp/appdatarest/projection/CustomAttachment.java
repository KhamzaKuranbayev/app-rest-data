package uz.pdp.appdatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdatarest.entity.Address;
import uz.pdp.appdatarest.entity.Attachment;

@Projection(types = Attachment.class)
public interface CustomAttachment {

    Integer getId();

    String getName();

    long getSize();

    String getContentType();

}
