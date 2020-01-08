/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SAV.Core.Contracts.Interfaces.Services.ApplicationServices;

import SAV.Core.Contracts.Interfaces.Services.IService;

/**
 *
 * @author savarela
 */
public interface IErrorWindowService extends IService{
    boolean OnErrorRecived(Exception Ex);
}
