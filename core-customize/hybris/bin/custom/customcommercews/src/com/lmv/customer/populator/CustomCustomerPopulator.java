package com.lmv.customer.populator;

import de.hybris.platform.commercefacades.user.data.AddressData;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.util.Assert;

public class CustomCustomerPopulator implements Populator<CustomerModel, CustomerData>
{
    private Converter<AddressModel, AddressData> addressConverter;

    @Override
    public void populate(CustomerModel source, CustomerData target) throws ConversionException
    {
        Assert.notNull(source, "Parameter source CustomerModel cannot be null.");
        Assert.notNull(target, "Parameter target CustomerData cannot be null.");

        target.setNickname(source.getNickname());

        if(source.getWorkOfficeAddress() != null){
            target.setWorkOfficeAddress(getAddressConverter().convert(source.getWorkOfficeAddress()));
        }

    }

    public Converter<AddressModel, AddressData> getAddressConverter() {
        return addressConverter;
    }

    @Required
    public void setAddressConverter(Converter<AddressModel, AddressData> addressConverter) {
        this.addressConverter = addressConverter;
    }
}
