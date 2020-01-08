/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SAV.Core.Contracts.Interfaces.Services.ApplicationServices;

import SAV.Core.Contracts.Clazz.Lazy;
import SAV.Core.Contracts.Interfaces.Metadata.IServiceMetadata;
import SAV.Core.Contracts.Interfaces.Services.IService;
import java.lang.reflect.Type;

/**
 *
 * @author savarela
 */
public interface IIncidentFixerService extends IService {
    boolean IsResponsibleFor(Type targedType);
    Lazy<IService, IServiceMetadata> OnIncident(Iterable<Lazy<IService, IServiceMetadata>> defauldInplementations);
}

