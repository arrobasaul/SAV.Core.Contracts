/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SAV.Core.Contracts.Interfaces.Services.ShellServices;

import SAV.Core.Contracts.Interfaces.Metadata.IServiceMetadata;
import SAV.Core.Contracts.Interfaces.Services.IService;

/**
 *
 * @author savarela
 */
public interface IServicePool {
    //void FreeAssambly(Assembly assambly);
    //bool RegisterExportsChanged(EventHandler<ExportsChangeEventArgs> exportsChange);
    //bool RegisterExportsChanging(EventHandler<ExportsChangeEventArgs> exportsChangeing);
    //bool Import([Required] ComposablePart part);
    //bool Compose([Required] CompositionBatch composition);
    //IEnumerable<Lazy<IService, IServiceMetadata>> GetServiceInternal(bool ignoreDefauld = true);
    IService GetDefaultSingelService();
    IService GetSingelService();
    //bool TryGetSingelService<T>([Out] [Required] T output) where T : class, IService;
    Iterable< IService> GetServices() ;
    //bool TryGetServices<T>([Out] [Required] IEnumerable<T> output) where T : class, IService;
    //bool TryGetMetadata([Out] [Required] IEnumerable<IServiceMetadata> output);
    //IEnumerable<T> GetMetadatas<T>() where T : class, IServiceMetadata;
    Iterable<IServiceMetadata> GetMetadatas();
    Iterable<IServiceMetadata> GetAllMetadata();
}
