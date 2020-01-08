/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SAV.Core.Contracts.Interfaces.Services.ApplicationServices;

import SAV.Core.Contracts.Interfaces.IApplicationContext;
import SAV.Core.Contracts.Interfaces.Services.ModuleServices.IVisualService;

/**
 *
 * @author savarela
 */
public interface IApplicationContainer extends IVisualService {
    public IApplicationContext ApplicationContextProxy();
}
