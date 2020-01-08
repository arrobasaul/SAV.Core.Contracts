/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SAV.Core.Contracts.Interfaces.Services.ShellServices;

import SAV.Core.Contracts.Interfaces.Metadata.IVisualServiceMetadata;
import SAV.Core.Contracts.Interfaces.Services.IService;
import SAV.Core.Contracts.Interfaces.Services.ModuleServices.IVisualService;

/**
 *
 * @author savarela
 */
public interface IVisualModuleManager extends IService{
    void NotifyServicesChanged();
    Iterable<IVisualServiceMetadata> GetVisualServicesMetadata();

    IVisualService CreateService(String serviceMetadataDescriptor);
    IVisualService CreateService(IVisualServiceMetadata serviceMetadata);
    IVisualService CreateDefaultVisualService();
}
